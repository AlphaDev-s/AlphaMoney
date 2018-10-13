package com.alpha;

public class MoneyOperations {

    public static String summ (String x, String y){
        System.out.println();
        System.out.println("x " + x);
        System.out.println("y " + y);
        if (!x.contains(".") && !y.contains(".")){
            try{
                long c1 = Long.parseLong(x);
                if (c1 < Long.MIN_VALUE/2 || c1 > Long.MAX_VALUE/2) return null;
                long c2 = Long.parseLong(y);
                if (c2 < Long.MIN_VALUE/2 || c2 > Long.MAX_VALUE/2) return null;
                return Long.toString(c1 + c2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (x.contains(".") && y.contains(".")){
            try{
                float c1 = Float.parseFloat(x);
                if (c1 < Float.MIN_VALUE/2 || c1 > Float.MAX_VALUE/2) return null;
                float c2 = Float.parseFloat(y);
                if (c2 < Float.MIN_VALUE/2 || c2 > Float.MAX_VALUE/2) return null;
                return Float.toString(c1 + c2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (x.contains(".") && !y.contains(".")){
            try{
                System.out.println((float) Math.round(Float.parseFloat(x)));
                if (Long.parseLong(y) < Long.MIN_VALUE/2 || Long.parseLong(y) > Long.MAX_VALUE/2) return null;
                String resPart1 = Float.toString((float)Math.round(Float.parseFloat(x)) + (float)Long.parseLong(y));
                return resPart1 + x.substring(x.indexOf ("."));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!x.contains(".") && y.contains(".")){
            try{
                if (Long.parseLong(x) < Long.MIN_VALUE/2 || Long.parseLong(x) > Long.MAX_VALUE/2) return null;
                String resPart1 = Float.toString(Long.parseLong(x) + Float.parseFloat(y));
                return resPart1 + y.substring(y.indexOf ("."));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public static String subtract (String x, String y){
        System.out.println();
        System.out.println("x " + x);
        System.out.println("y " + y);
        if (!x.contains(".") && !y.contains(".")){
            try{
                long c1 = Long.parseLong(x);
                if (c1 < Long.MIN_VALUE/2 || c1 > Long.MAX_VALUE/2) return null;
                long c2 = Long.parseLong(y);
                if (c2 < Long.MIN_VALUE/2 || c2 > Long.MAX_VALUE/2) return null;
                return Long.toString(c1 - c2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (x.contains(".") && y.contains(".")){
            try{
                float c1 = Float.parseFloat(x);
                if (c1 < Float.MIN_VALUE/2 || c1 > Float.MAX_VALUE/2) return null;
                float c2 = Float.parseFloat(y);
                if (c2 < Float.MIN_VALUE/2 || c2 > Float.MAX_VALUE/2) return null;
                return Float.toString(c1 - c2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (x.contains(".") && !y.contains(".")){
            try{
                System.out.println((float) Math.round(Float.parseFloat(x)));
                if (Long.parseLong(y) < Long.MIN_VALUE/2 || Long.parseLong(y) > Long.MAX_VALUE/2) return null;
                String resPart1 = Float.toString((float)Math.round(Float.parseFloat(x)) - (float)Long.parseLong(y));
                return resPart1 + x.substring(x.indexOf ("."));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!x.contains(".") && y.contains(".")){
            try{
                if (Long.parseLong(x) < Long.MIN_VALUE/2 || Long.parseLong(x) > Long.MAX_VALUE/2) return null;
                String resPart1 = Float.toString(Long.parseLong(x) - Float.parseFloat(y));
                return resPart1 + y.substring(y.indexOf ("."));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public static String multiply (String x, String y){
        System.out.println();
        System.out.println("x " + x);
        System.out.println("y " + y);
        if (!x.contains(".") && !y.contains(".")){
            try{
                long c1 = Long.parseLong(x);
                if (c1 < Long.MIN_VALUE/2 || c1 > Long.MAX_VALUE/2) return null;
                long c2 = Long.parseLong(y);
                if (c2 < Long.MIN_VALUE/2 || c2 > Long.MAX_VALUE/2) return null;
                return Long.toString(c1 * c2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (x.contains(".") && y.contains(".")){
            try{
                float c1 = Float.parseFloat(x);
                if (c1 < Float.MIN_VALUE/2 || c1 > Float.MAX_VALUE/2) return null;
                float c2 = Float.parseFloat(y);
                if (c2 < Float.MIN_VALUE/2 || c2 > Float.MAX_VALUE/2) return null;
                return Float.toString(c1 * c2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (x.contains(".") && !y.contains(".")){
            try{
                System.out.println((float) Math.round(Float.parseFloat(x)));
                if (Long.parseLong(y) < Long.MIN_VALUE/2 || Long.parseLong(y) > Long.MAX_VALUE/2) return null;
                String resPart1 = Float.toString((float)Math.round(Float.parseFloat(x)) * (float)Long.parseLong(y));
                return resPart1 + x.substring(x.indexOf ("."));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!x.contains(".") && y.contains(".")){
            try{
                if (Long.parseLong(x) < Long.MIN_VALUE/2 || Long.parseLong(x) > Long.MAX_VALUE/2) return null;
                String resPart1 = Float.toString(Long.parseLong(x) * Float.parseFloat(y));
                return resPart1 + y.substring(y.indexOf ("."));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public static String division (String x, String y){
        System.out.println();
        System.out.println("x " + x);
        System.out.println("y " + y);
        if (!x.contains(".") && !y.contains(".")){
            try{
                long c1 = Long.parseLong(x);
                if (c1 < Long.MIN_VALUE/2 || c1 > Long.MAX_VALUE/2) return null;
                long c2 = Long.parseLong(y);
                if (c2 < Long.MIN_VALUE/2 || c2 > Long.MAX_VALUE/2) return null;
                return Long.toString(c1 / c2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (x.contains(".") && y.contains(".")){
            try{
                float c1 = Float.parseFloat(x);
                if (c1 < Float.MIN_VALUE/2 || c1 > Float.MAX_VALUE/2) return null;
                float c2 = Float.parseFloat(y);
                if (c2 < Float.MIN_VALUE/2 || c2 > Float.MAX_VALUE/2) return null;
                return Float.toString(c1 / c2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (x.contains(".") && !y.contains(".")){
            try{
                System.out.println((float) Math.round(Float.parseFloat(x)));
                if (Long.parseLong(y) < Long.MIN_VALUE/2 || Long.parseLong(y) > Long.MAX_VALUE/2) return null;
                String resPart1 = Float.toString((float)Math.round(Float.parseFloat(x)) / (float)Long.parseLong(y));
                return resPart1 + x.substring(x.indexOf ("."));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!x.contains(".") && y.contains(".")){
            try{
                if (Long.parseLong(x) < Long.MIN_VALUE/2 || Long.parseLong(x) > Long.MAX_VALUE/2) return null;
                String resPart1 = Float.toString(Long.parseLong(x) / Float.parseFloat(y));
                return resPart1 + y.substring(y.indexOf ("."));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
