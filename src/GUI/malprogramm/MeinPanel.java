package GUI.malprogramm;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MeinPanel extends JPanel implements MouseListener,MouseMotionListener {

	double mMouseX;
	double mMouseY;
	ArrayList<Point> mPunkte;
	
	public MeinPanel()
	{
		setPreferredSize(new Dimension(800, 600));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		mMouseX=0;
		mMouseY=0;
		mPunkte=new ArrayList<>();
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		for (Point p:mPunkte)
		{
			//g.drawRect(p.x, p.y, 8, 8);
			g.drawOval(p.x, p.y, 5, 5);
		}
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX()+" "+e.getY());
		mMouseX=e.getX();
		mMouseY=e.getY();
		
		this.repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		mMouseX=e.getX();
		mMouseY=e.getY();
		mPunkte.add(new Point(e.getX(), e.getY()));
		this.repaint(0, 0, 800, 600);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
