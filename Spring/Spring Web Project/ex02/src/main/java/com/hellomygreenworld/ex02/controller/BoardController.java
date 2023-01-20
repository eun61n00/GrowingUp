package com.hellomygreenworld.ex02.controller;

import com.hellomygreenworld.ex02.domain.BoardVO;
import com.hellomygreenworld.ex02.domain.Criteria;
import com.hellomygreenworld.ex02.domain.PageDTO;
import com.hellomygreenworld.ex02.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Log4j
@RequestMapping("/board")
@AllArgsConstructor
public class BoardController {

    private BoardService boardService;
    
    @GetMapping("/list")
    public void list(Criteria criteria, Model model) {
        criteria.setOffset((criteria.getPageNum() - 1) * criteria.getAmount());
        log.info("=== list" + "(criteria: " + criteria + ") ===" );
        model.addAttribute("list", boardService.getList(criteria));
        model.addAttribute("PageDTO", new PageDTO(criteria, 200));
    }

    @GetMapping("register")
    public void register() {

    }

    @PostMapping("/register")
    public String register(BoardVO boardVO, RedirectAttributes rttr) {
        log.info("=== register: " + boardVO + " ===");
        boardService.register(boardVO);
        rttr.addFlashAttribute("result", boardVO.getId());

        return "redirect:/board/list";
    }

    @GetMapping({"/get", "/modify"})
    public void get(@RequestParam("id") int id, Model model) {
        log.info("=== get or modify ===");
        model.addAttribute("board", boardService.get(id));
    }

    @PostMapping("/modify")
    public String modify(BoardVO boardVO, RedirectAttributes rttr) {
        log.info("=== modify: " + boardVO + " ===");
        if(boardService.modify(boardVO))
            rttr.addFlashAttribute("result", "success");
        return "redirect:/board/list";
    }

    @PostMapping("/remove")
    public String remove(@RequestParam("id") int id, RedirectAttributes rttr) {
        log.info("=== remove === ");
        if (boardService.remove(id)) {
            rttr.addFlashAttribute("result", "success");
        }
        return "redirect:/board/list";
    }

}
