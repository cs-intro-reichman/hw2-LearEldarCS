public class TimeCalc {
    public static void main(String[] args) {
        // int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        // int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minToAdd = Integer.parseInt(args[1]);

        int totelMinutes = (hours * 60) + minutes + minToAdd; 
        int totelHours = totelMinutes / 60; 
        int newHours = totelHours % 24; 
        int newMinutes = totelMinutes - (totelHours * 60);

        String Hours;
        String Minutes;
        
        if (newHours >= 0 && newHours <= 9) {
            Hours = "0" + newHours;
        } else {
            Hours = "" + newHours;
        }

        if (newMinutes >= 0 && newMinutes <= 9) {
            Minutes = "0" + newMinutes;
        } else {
            Minutes = "" + newMinutes;
        }

        System.out.println(Hours + ":" + Minutes);


    }
}
