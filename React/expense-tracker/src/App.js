import { useState } from "react";
import "./App.css";
import Expenses from "./component/Expense/Expenses";
import NewExpense from "./component/NewExpense/NewExpense";
function App() {
  const defaultExpenses = [
    {
      id: "e1",
      title: "Toilet Paper",
      amount: 94.12,
      date: new Date(2020, 7, 14),
    },
    { id: "e2", title: "New TV", amount: 799.49, date: new Date(2021, 2, 12) },
    {
      id: "e3",
      title: "Car Insurance",
      amount: 294.67,
      date: new Date(2021, 2, 28),
    },
    {
      id: "e4",
      title: "New Desk (Wooden)",
      amount: 450,
      date: new Date(2021, 5, 12),
    },
  ];

  const [expenses, setExpenses] = useState(defaultExpenses);

  const addExpenseToListHandler = (expenseData) => {
    setExpenses((prevState) => [...prevState, expenseData]);
  };
  return (
    <div className="App">
      <header>
        <NewExpense onSave={addExpenseToListHandler} />
      </header>
      <Expenses expenses={expenses} />
    </div>
  );
}

export default App;
