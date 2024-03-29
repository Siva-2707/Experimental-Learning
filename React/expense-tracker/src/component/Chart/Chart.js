import "./Chart.css";
import ChartBar from "./ChartBar";
export default function Chart({ dataPoints }) {
  const valuesFromDataPoints = dataPoints.map((dataPoint) => dataPoint.value);
  const maxValue = Math.max(...valuesFromDataPoints);
  return (
    <div className="chart">
      {dataPoints.map((dataPoint) => (
        <ChartBar key={dataPoint.label} value={dataPoint.value} maxValue={maxValue} label={dataPoint.label} />
      ))}
    </div>
  );
}
