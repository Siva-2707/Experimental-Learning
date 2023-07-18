import Chart from "../Chart/Chart";
export default function ExpensesChart({ expenses }) {
  const months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];
  const dataPoints = months.map((month) => {
    return { label: month, value: 0 };
  });
  for (const exp of expenses) {
    const expenseMonth = exp.date.getMonth();
    dataPoints[expenseMonth].value += exp.amount;
  }
  //   console.log(dataPoints);
  return (
    <div>
      <Chart dataPoints={dataPoints}></Chart>
    </div>
  );
}
