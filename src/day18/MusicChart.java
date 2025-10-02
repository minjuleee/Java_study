package day18;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MusicChart extends JFrame implements ActionListener {
	
	JLabel[] labels;
	JButton bt;
	JLabel log;
	int count = 0;
	
	MusicChart(){
		bt = new JButton("GET!!!!");
		bt.setBounds(20, 20, 340, 30);	// x, y, width, height
		add(bt);
		bt.addActionListener(this);
		
		labels = new JLabel[10];
		for(int i=0; i<labels.length; i++) {
			labels[i] = new JLabel("Ranking " + (i+1));
			labels[i].setBounds(20, 80+(i*30), 340, 30);
			add(labels[i]);
		}
		
		log = new JLabel("Log Region");
		log.setBounds(20, 480, 340, 30);
		add(log);
		
		
		setSize(400, 600);	// Window의 크기
		setLayout(null);	// 모든 컴포넌트를 직접 위치 지정
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MusicChart();
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == bt) {
			System.out.println("Someone clicked Button");
			count++;
			log.setText("현재 클릭한 횟수 : " + count);
			
			String URL = "https://music.bugs.co.kr/chart";
			
			try {
				// 1. HTML(웹페이지) 소스를 가져온다.
				Document doc = Jsoup.connect(URL).get();
				System.out.println(doc);
				
				Elements elements = doc.select("p.title");
				System.out.println(elements);
				
				
				
				int rank = 1;
				for(Element element : elements) {
					String text = "Ranking " + rank + " : " + element.text();
					labels[rank-1].setText(text);
					if(rank == 10)
						break;
					rank++;
				}
				
				// Artist 추가
				Elements artists = doc.select("p.artist");
				System.out.println(artists);
				
				rank = 1;
				for(Element artist : artists) {
					String text = labels[rank-1].getText() + " - " + artist.text();
					labels[rank-1].setText(text);
					labels[rank-1].setFont(new Font("나눔고딕", Font.BOLD, 16));
					if(rank == 10) {
						break;
					}
					rank++;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		};
		
	}

}
