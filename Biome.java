/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nyu.cs9053.homework4;

/**
 *
 * @author arhan
 */
 public enum Biome {
    
Equitorial( "Equitorial" , " Always moist little temperature seasonality" ) ,
Tropical( "Tropical" ,  " summer rainy season and cooler “winter” dry season" ),
Subtropical( "Subtropical" ,  " highly seasonal, arid climate" ),
Mediterranean( "Mediterranean" , " winter rainy season and summer drought" ),
WarmTemperature( "WarmTemperature" , " occasional frost, often with summer rainfall maximum" ),
Normal( "Normal" , " moderate climate with winter freezing" ),
Continental( "Continental" , " arid, with warm or hot summers and cold winters" ),
Boreal( "Boreal" , " cold temperate with cool summers and long winters" ),
Polar( "Polar" , " short, cool summers and long, cold winters" );

private  final String description;
private  final String BiomeName;

private Biome(String BiomeName, String description)
    {
        this.BiomeName = BiomeName;
        this.description = description;
    }

 public String getDescription()
    {
        return description;
    }

  public String getBiomeName()
    {
        return BiomeName;
    }

public static void varargs( Biome ... arguments) {
 
for( Biome b : arguments) {
System.out.println( b.getBiomeName() + "   " + b.getDescription());     
}
}   
}