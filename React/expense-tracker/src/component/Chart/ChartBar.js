import "./ChartBar.css";
export default function ChartBar(props) {
  let amountToBeFilled = "0%";
  if (props.maxValue > 0) amountToBeFilled = Math.floor((props.value / props.maxValue) * 100) + "%";
  console.log(props.label, amountToBeFilled);
  return (
    <div className="chart-bar">
      <div className="chart-bar__inner">
        <div className="chart-bar__fill" style={{ height: amountToBeFilled }}></div>
      </div>
      <div className="chart-bar__label">{props.label}</div>
    </div>
  );
}
