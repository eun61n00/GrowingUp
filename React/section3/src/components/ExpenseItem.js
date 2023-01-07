import "./ExpenseItem.css";

function ExpenseItem() {
	const expenseDate = new Date(2023, 1, 7);
	const expenseTitle = "Car Insurance";
	const expenseAmount = 294.67;

	return (
		<div className="expense-item">
			<div className="expense-item__description">
				<div className="expense-item__date">{expenseDate.toDateString()}</div>
				<h2>{expenseTitle}</h2>
				<div className="expense-item__price">${expenseAmount}</div>
			</div>
		</div>
	);
}

export default ExpenseItem;
