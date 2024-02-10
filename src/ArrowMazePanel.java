import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ArrowMazePanel extends JPanel
{
    public ArrowCell[][] myGrid;

    public static final int NUM_ROWS = 25;
    public static final int NUM_COLS = 35;
    public ArrowMazePanel()
    {
        super();
        myGrid = new ArrowCell[NUM_ROWS][NUM_COLS];
        resetField();

    }

    /**
     * recreates the NUM_ROWS x NUM_COLS field with randomized Cells
     */
    public void resetField()
    {
        for (int r=0; r<NUM_ROWS; r++)
            for (int c=0; c<NUM_COLS; c++)
                myGrid[r][c] = new ArrowCell(r,c);
        repaint();
    }

    /**
     * refreshes the screen by telling all the cells to draw themselves.
     * @param g the <code>Graphics</code> object to protect
     */
    public void paintComponent(Graphics g)
    {
        // TODO #0: you write this!
    }

    /**
     * determines whether the coloring process has finished.
     * @return false if any of the ArrowCells are still black, true otherwise.
     */
    public boolean noBlackCellsRemain()
    {
        // TODO #1: you write this!
        return false; // replace this line.

    }

    /**
     * gets the cell that is pointed to by the given cell, or null if it is pointing out of bounds.
     * @param cell - the cell that is doing the pointing
     * @return - the cell that is pointed at, or null if cell pointed out of bounds.
     */
    public ArrowCell targetOfArrowCell(ArrowCell cell)
    {
        // TODO #2: you write this!

        return null; // replace this line.
    }

    /**
     * tells all the ArrowCells in the given list to take on the given color
     * @param c - the color to change to
     * @param path - an ArrayList of ArrowCells
     */
    public void setColorForPath(Color c, ArrayList<ArrowCell> path)
    {
        // TODO #3: you write this!
    }

    /**
     * If the cell at the given location is black...
     * Starting at the given location, trace a path until this path either:
     * a) goes out of bounds
     * b) points to a member of its own path
     * c) points to another, non-black cell
     * In the case of (a) or (b) pick a random color for all the cells in this path. The color should have good contrast
     * with the starting black color and the white arrows.
     * In the case of (c), set all the cells in the path to the color to which we just ran into
     * @param row - row of start cell
     * @param col - col of start cell
     */
    public void colorPathStartingAt(int row, int col)
    {
        // TODO #4: you write this!
    }
    /**
     * Color a single path, starting at a random location. This might go out of bounds, end at it own termination,
     * or enter another, existing point. This will not necessarily find all the cells that might lead to a given
     * termination.
     * (Called in response to the "find 1 path" button press by user.)
     */
    public void find1Path() {
        // TODO #5: you write this!
    }

    /**
     * identify the fraction of cells in myGrid that are not black.
     * @return - the fraction of non-black cells in myGrid.
     */
    public double getPercentageNonBlack()
    {
        // TODO #6: you write this!
        return 0.0;// replace this.
    }
    /**
     * trace paths until all ArrowCells are colored other than black.
     */
    public void findAllPaths()
    {
        for (int cellNum = 0; cellNum<NUM_ROWS*NUM_COLS; cellNum++)
        {
            colorPathStartingAt(cellNum / NUM_COLS, cellNum % NUM_COLS);
        }
        if (noBlackCellsRemain())
            System.out.println("All cells painted.");
    }
}
