import { useState } from "react";
import Card from "../UI/Card";
import "./Expenses.css";
import ExpensesChart from "./ExpensesChart";
import ExpensesFilter from "./ExpensesFilter";
import ExpensesList from "./ExpensesList";

export default function Expenses({ expenses }) {
  const [year, setYear] = useState("2023");

  const filterExpensesByYear = (year) => {
    setYear(year);
  };

  const filteredExpenses = expenses.filter((exp) => exp.date.getFullYear().toString() === year);
  return (
    <Card className="expenses">
      <ExpensesFilter onFilterSelect={filterExpensesByYear} />
      <ExpensesChart expenses={filteredExpenses} />
      <ExpensesList filteredExpenses={filteredExpenses} />
    </Card>
  );
}
