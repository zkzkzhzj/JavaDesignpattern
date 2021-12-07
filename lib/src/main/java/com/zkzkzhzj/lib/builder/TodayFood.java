package com.zkzkzhzj.lib.builder;

public class TodayFood {
    private String result;

    @Override
    public String toString() {
        return result;
    }

    public static class Builder{
        private String[] cardList;
        private String[] foodList;

        /*
         * Varargs 라고 하며 메서드 인수에서만 사용가능하다.
         * 가변 개수의 매개변수를 메서드에 전달 하며
         * 배열을 명시적으로 생성하지 않고도 매개변수 전달 가능
         * EX)
         * String[] -> method(new String[]{"one", "two"});
         * String... -> method("one", "two");
         */
        public Builder setCardList(String... cardList){
            this.cardList = cardList;
            return this;
        }

        public Builder setFoodList(String... foodList){
            this.foodList = foodList;
            return this;
        }

        public TodayFood build(){
            TodayFood todayFood = new TodayFood();
            StringBuilder sb = new StringBuilder();

            if(cardList != null){
                int index = (int) (Math.random() * cardList.length);
                sb.append("오늘 음식 값은 ").append(cardList[index]).append(" 계산입니다!").append("\n");
            } else {
                sb.append("등록하신 카드가 없습니다 ㅜㅜ").append("\n");
            }
            if(foodList != null){
                int index = (int) (Math.random() * foodList.length);
                sb.append("선택된 음식은 ").append(foodList[index]).append("입니다!");
            } else {
                sb.append("등록하신 음식이 없습니다 ㅜㅜ");
            }
            todayFood.result = sb.toString();
            return todayFood;
        }
    }
}
