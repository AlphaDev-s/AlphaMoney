package com.alpha;

public class MoneyOperations {

    public Long summ (Long x, Long y){
        try{
            if (x < Long.MIN_VALUE/2 || y > Long.MAX_VALUE/2) return null;
            if (x < Long.MIN_VALUE/2 || y > Long.MAX_VALUE/2) return null;
            return x + y;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Long subtract (Long x, Long y){
        try{
            if (x < Long.MIN_VALUE/2 || y > Long.MAX_VALUE/2) return null;
            if (x < Long.MIN_VALUE/2 || y > Long.MAX_VALUE/2) return null;
            return x - y;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Long multiply (Long x, Long y){
        try{
            if (x < Long.MIN_VALUE/2 || y > Long.MAX_VALUE/2) return null;
            if (x < Long.MIN_VALUE/2 || y > Long.MAX_VALUE/2) return null;
            return x * y;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Long division (Long x, Long y){
        try{
            if (x < Long.MIN_VALUE/2 || y > Long.MAX_VALUE/2) return null;
            if (x < Long.MIN_VALUE/2 || y > Long.MAX_VALUE/2) return null;
            return x / y;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
