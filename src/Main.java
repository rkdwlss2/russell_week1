import grandFrix.GrandFrix;
import vehicle.F1Car;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
  //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
  // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
    ArrayList<F1Car> raceList = new ArrayList<>();
    // 1. 레이스 시작
    Scanner sc = new Scanner(System.in);
    GrandFrix grandFrix = new GrandFrix();
    System.out.println("F1 그랑프리 입력하세요 : ");
    grandFrix.setName(sc.nextLine());
    System.out.println(grandFrix.getName()+"그랑프리에 오신걸 환영합니다");

    System.out.println("F1 드라이버 수 입력하세요 : ");

    int driverNum = sc.nextInt();

    for (int i = 0 ; i<driverNum;i++){
        raceList.add(new F1Car());
    }

    // 2. 순위 선정
    int[] points = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1};
    Collections.sort(raceList,(a,b)->Double.compare(a.getLapTime(), b.getLapTime()));

    System.out.println("===========한국 F1 그랑프리 레이싱 결과===================");

    // 3. 포디움 선정
    // 한팀의 2명의 드라이버가 포디움(순위권)일때
    if (raceList.get(0).name.equals(raceList.get(1).name) || raceList.get(0).name.equals(raceList.get(2).name)) {
        System.out.println(raceList.get(0).name + " 더블포디움 ");
    } else if (raceList.get(1).name.equals(raceList.get(2).name)) {
        System.out.println(raceList.get(1).name + " 더블포디움 ");
    }

    // 4. 순위권 출력
    for (int i=0;i<raceList.size();i++){
        // 순위권 내에 들었을때
        if (i<3) {
            System.out.println(" ==== 포디움 ==== ");
        }
        if (i<10){
            System.out.println((i + 1) + " 등"+" 점수 : "+points[i]);
        }else{
            System.out.println((i + 1) + " 등"+" 점수 : 0");
        }

        raceList.get(i).Print();
    }


}
