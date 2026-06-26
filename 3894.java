class Solution {
    public String trafficSignal(int timer) {
        // if(timer == 0){
        //     return "Green";
        // }else if(timer == 30){
        //     return "Orange";
        // }else if(timer>30 && timer<=90){
        //     return "Red";
        // }else{
        //     return "Invalid";
        // }

        return switch(timer){
            case 0-> "Green";
            case 30-> "Orange";
            default->{
                if(timer>30 && timer<=90){
                    yield "Red";
                }else{
                    yield "Invalid";
                }
            }
        };
    }
}