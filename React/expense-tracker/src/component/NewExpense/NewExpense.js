import { useState } from "react";
import "./NewExpense.css";
import NewExpenseForm from "./NewExpenseForm";
export default function NewExpense({ onSave }) {
  const expenseDataHandler = (enteredExpenseData) => {
    const expenseData = { ...enteredExpenseData, id: Math.random().toString() };
    onSave(expenseData);
  };
  const [formHidden, setFormHidden] = useState(true);
  return <div className="new-expense">{formHidden ? <button onClick={() => setFormHidden(false)}>Add new expense</button> : <NewExpenseForm onSave={expenseDataHandler} />}</div>;
}
