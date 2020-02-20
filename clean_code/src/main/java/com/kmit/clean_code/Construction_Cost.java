package com.kmit.clean_code;

public class Construction_Cost {
	int estimate(int type_of_material,int area_of_house,int automation_required) {
        int total=0;
if(automation_required==1&&type_of_material==3)
{
        total=2500*area_of_house;
}
else {
        switch(type_of_material) {
        case 1: total=1200*area_of_house;break;
        case 2:total=1500*area_of_house;break;
        case 3:total=1800*area_of_house;break;
        }
        
         
         
         
}
return total;

}
}
