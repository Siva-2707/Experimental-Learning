import Concept from "./Concept";
import './Concepts.css';
export default function Concepts({concepts}){
    let conceptsList =[];
    concepts.forEach(concept => conceptsList.push(<Concept title={concept.title} image={concept.image} description={concept.description}/>))
    return(
        <div className="concepts">
            {conceptsList}
        </div>
    );
}