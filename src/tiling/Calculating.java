/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiling;

/**
 *
 * @author diana
 */
public class Calculating {

    private final double surface, tile, gap;
    private double residue, edge;
    private int fittingTiles, wholeTiles, allTiles, cutTiles;

    public Calculating(double surface, double tile, double gap) {
        this.surface = surface;
        this.tile = tile;
        this.gap = gap;
        calculation(surface, tile, gap);
    }

    private void calculation(double surface, double tile, double gap) {
        // Kõik mahtuvad terved
        Double x = surface / (tile + gap);
        fittingTiles = x.intValue();

        // Jääk
        residue = surface % (tile + gap);

        // Kas algab pooliku või terve plaadiga
        if (residue < (tile / 2) && residue > 0) {
            // Algab pooliku plaadiga
            wholeTiles = fittingTiles - 1;
            edge = (residue + tile) / 2;
            allTiles = wholeTiles + 2;
            cutTiles = 2;
        } else {
            // Algab terve plaadiga
            wholeTiles = fittingTiles;
            edge = residue;
            if (residue > 0) {
                allTiles = fittingTiles + 1;
                cutTiles = 1;
            } else {
                allTiles = fittingTiles;
                cutTiles = 0;
            }
        }
    }
    
    public int getWholeTiles() {
        return wholeTiles;
    }

    public int getFittingTiles() {
        return fittingTiles;
    }

    public int getAllTiles() {
        return allTiles;
    }

    public int getCutTiles() {
        return cutTiles;
    }

    public double getResidue() {
        return round(residue, 2);
    }

    public double getEdge() {
        return round(edge, 2);
    }

    private double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
