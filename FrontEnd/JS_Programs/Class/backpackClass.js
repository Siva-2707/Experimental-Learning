

class Backpack{
    //Constructor definition
    constructor(name, volume, color, isLidOpen){
        this.name = name;
        this.volume = volume;
        this.color = color;
        this.isLidOpen = isLidOpen;
    }

    //This is one type of method declaration
    toggleLid = function() {
        this.isLidOpen = !this.isLidOpen;
    }
    //Another type of method declaration
    changeColor(color){
        this.color = color;
    }

}

export default Backpack;