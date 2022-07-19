import java.util.*;

import javax.swing.ImageIcon;
class Terran extends Tribe {
	
	Terran(StarUI ui){
		
		super(ui);
		
		this.ui = ui;
		tribe = "Terran"; //종족 이름
		//////////유닛 및 건물 이름//////////
		mainbuildingName="CommandCenter";
		building1Name="Barracks";
		building2Name="Factory";
		building3Name="SupplyDepot";
		workerName="SCV";
		attacker1Name="Marine";
		attacker2Name="Tank";
		/////////유닛의 파워정보//////
		workerPower=2;
		attacker1Power=6;
		attacker2Power=10;
		///////유닛 및 건물 에너지 정보/////
		workerEnergy=60;
		attacker1Energy=40;
		attacker2Energy=150;
		mainBEnergy=1500;
		building1Energy=1000;
		building2Energy=1250;
		building3Energy=500;
		//////////유닛 및 건물 간략한 설명/////
		mainBdesc = "Terran Command Center";
		building1desc = "Terran Barracks";
		building2desc = "Terran Factory";
		building3desc = "Terran Supply Depot";
		workerdesc = "Terran SCV";
		attacker1desc = "Terran Marine";
		attacker2desc = "Terran Siege Tank";
		///////////건물및 유닛 이미지//////////////
		mainBIC = new ImageIcon("img/terranmainB.jpg");
		building1IC = new ImageIcon("img/terranbuilding1.jpg");
		building2IC = new ImageIcon("img/terranbuilding2.jpg");
		building3IC = new ImageIcon("img/terranbuilding3.jpg");
		workerIC = new ImageIcon("img/terranworker.jpg");
		attacker1IC = new ImageIcon("img/terranattacker1.jpg");
		attacker2IC = new ImageIcon("img/terranattacker2.jpg");
		//////////건물 및 유닛 페이스 이미지/////////////
		buildingface = new ImageIcon("img/terranbuildingface.jpg");
		workerface =new ImageIcon("img/terranworkerface.jpg");
		attacker1face = new ImageIcon("img/terranattacker1face.jpg");
		attacker2face = new ImageIcon("img/terranattacker2face.jpg");
		
		
		///////////건물 및 유닛 아이템(행동)정보 초기화///////////	
		mainBVT = new ArrayList();
		building1VT = new ArrayList();
		building2VT = new ArrayList();
		building3VT = new ArrayList();
		workerVT = new ArrayList();
		attacker1VT = new ArrayList();
		attacker2VT = new ArrayList();
		
		mainBVT = new ArrayList();
		building1VT = new ArrayList();
		building2VT = new ArrayList();
		building3VT = new ArrayList();
		workerVT = new ArrayList();
		attacker1VT = new ArrayList();
		attacker2VT = new ArrayList();
		
		mainBItem = new ArrayList();
		mainBItem.add("SCV");
		
		building1Item = new ArrayList();
		building1Item.add("Marine");
		
		building2Item = new ArrayList();
		building2Item.add("Tank");
		
		building3Item = new ArrayList();
		building3Item.add("Upgrade");
		
		workerItem = new ArrayList();
		workerItem.add("놀기");
		workerItem.add("미네랄");
		workerItem.add("가스");
		workerItem.add("CommandCenter");
		workerItem.add("Barracks");
		workerItem.add("Factory");
		workerItem.add("SupplyDepot");
		workerItem.add("공격하기");
		
		attacker1Item = new ArrayList();
		attacker1Item.add("놀기");
		attacker1Item.add("공격하기");
		
		attacker2Item = new ArrayList();
		attacker2Item.add("놀기");
		attacker2Item.add("공격하기");
		
		mainBVT.add(new CommandCenter(ui)); //최초 커맨드 건물 기본 하나
		
		for(int i=0;i<10;i++){//최초 SCV기본 4명
			workerVT.add(new SCV(ui));
		}		
		setUpgrade(0);//최초 업그레이드 파워 0
		setUnit(workerVT.size(),attacker1VT.size(),attacker2VT.size());
		setBuilding(mainBVT.size(),building1VT.size(),building2VT.size(),building3VT.size());
		
	}
}
