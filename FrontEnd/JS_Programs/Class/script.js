//Class that is imported
// import Backpack from "./backpackClass.js";



//Constructing object templates with the object constructor.
//This was the old way to create templates and use them as Objects util Class was introduced.
function Backpack(name, volume, color, isLidOpen){
    this.name = name;
    this.volume = volume;
    this.color = color;
    this.isLidOpen = isLidOpen;

    this.toggleLid = function() {
        this.isLidOpen = !this.isLidOpen;
    };
    this.changeColor = function(color){
        this.color = color;
    };

}


const lapTopBag = new Backpack("Laptop Bag",30,"Red",false);
console.log(lapTopBag);
lapTopBag.toggleLid();
lapTopBag.changeColor("Blue");
console.log(lapTopBag);