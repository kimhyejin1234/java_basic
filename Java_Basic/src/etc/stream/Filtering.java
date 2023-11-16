package etc.stream;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static etc.lambda.FilterApple.filter;
import static etc.stream.Menu.menuList;

public class Filtering {

    public static void main(String[] args) {
        //stream의 filter
        //필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환
        //메뉴중에 채식주의자가 먹을수 있는 요리를 필터링
        menuList.stream()
                .filter(dish -> dish.isVegetarian())
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println(dish));

//        dishInVegiterian.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("==육류이면서 600칼로리 미만의 요리를 필터링===");
        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT && d.getCalories() < 600)
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

        System.out.println("====요리중에 요리이름이 4글자 요리만 필터링 ====");
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));


        System.out.println("====요리중에 300칼로리보다 큰 요리만 필터링 ====");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                
                .limit(3) //상위  top3  추출
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

        System.out.println("===========================");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2) //맨 잎 2게 제외
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

        System.out.println("=====메뉴 목록에서 처음 등장하는 2개의 생성요리 필터링 ======================");
        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.FISH)
                .limit(2) //상위  top2  추출
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        //짝수만 걸러내기
        List<Integer> fiilteredNumber = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct() //중복 제거
                .collect(Collectors.toList());
        System.out.println("fiilteredNumber : " + fiilteredNumber);

        //중복 제거
//        Set<Integer> d = new HashSet<>(fiilteredNumber);


    }
}
