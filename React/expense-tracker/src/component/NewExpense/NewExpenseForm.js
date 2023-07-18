import { useState } from "react";
import "./NewExpenseForm.css";
export default function NewExpenseForm({ onSave }) {
  //Using three states
  // const [title, setTitle] = useState("");
  // const [amount, setAmount] = useState("");
  // const [date, setDate] = useState("");
  // const titleChangeHandler = (event) => {
  //   setTitle(event.target.value);
  // };
  // const amountChangeHandler = (event) => {
  //   setAmount(event.target.value);
  // };
  // const dateChangeHandler = (event) => {
  //   setDate(event.target.value);
  // };

  //Combining multiple states into one without react state update.
  // const titleChangeHandler = (event) => {
  //   setNewExpenseItem({
  //     ...newExpenseItem,
  //     title: event.target.value,
  //   });
  // };
  // const amountChangeHandler = (event) => {
  //   setNewExpenseItem({
  //     ...newExpenseItem,
  //     amount: event.target.value,
  //   });
  // };
  // const dateChangeHandler = (event) => {
  //   setNewExpenseItem({
  //     ...newExpenseItem,
  //     date: event.target.value,
  //   });
  // };

  //React state update
  // const titleChangeHandler = (event) => {
  //   setNewExpenseItem((prevState) => {
  //     console.log(prevState);
  //     return { ...prevState, title: event.target.value };
  //   });
  // };
  // const amountChangeHandler = (event) => {
  //   setNewExpenseItem((prevState) => {
  //     return { ...prevState, amount: event.target.value };
  //   });
  // };
  // const dateChangeHandler = (event) => {
  //   setNewExpenseItem((prevState) => {
  //     return { ...prevState, date: event.target.value };
  //   });
  // };

  //Optimizing above piece of code.

  function changeHandler(identifier, value) {
    setNewExpenseItem((prevState) => {
      return { ...prevState, [identifier]: value };
    });
  }

  function submitHandler(event) {
    event.preventDefault();
    // const expenseItem = { ...newExpenseItem, date: new Date(newExpenseItem.date) };

    const enteredExpenseData = { ...newExpenseItem, date: new Date(newExpenseItem.date) };
    onSave(enteredExpenseData);
    setNewExpenseItem({
      title: "",
      amount: "",
      date: "",
    });
  }
  const [newExpenseItem, setNewExpenseItem] = useState({
    title: "",
    amount: "",
    date: "",
  });

  // console.log(newExpenseItem);
  return (
    <form onSubmit={submitHandler}>
      <div className="new-expense__controls">
        <div className="new-expense__control">
          <label>Title</label>
          <input type="text" onChange={(event) => changeHandler("title", event.target.value)} value={newExpenseItem.title} />
        </div>
        <div className="new-expense__control">
          <label>Amount</label>
          <input type="number" min="1" onChange={(event) => changeHandler("amount", event.target.value)} value={newExpenseItem.amount} />
        </div>
        <div className="new-expense__control">
          <label>Date</label>
          <input type="date" min="2019-01-01" max="2023-12-31" onChange={(event) => changeHandler("date", event.target.value)} value={newExpenseItem.date} />
        </div>
      </div>
      <div className="new-expense__actions">
        <button type="submit">Add expense</button>
      </div>
    </form>
  );
}
