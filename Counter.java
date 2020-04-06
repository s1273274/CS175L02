package counter;

public class Counter {

    private int value;

        /**
         Gets the current value.
         return the current value
         */
        public int getValue()
        {
            return value;
        }

        /**
         Advances the value by 1.
         */
        public void click()
        {
            value = value + 1;
        }

        /**
        Decreases the value by 1.
         */

        public void unclick()
        {
            value = value -1;
        }

        /**
        Resets the value to 0.
         */
        public void reset()
        {
            value = 0;

            Counter venue = new Counter();
            int rValue=venue.getValue();

            for (int c = 1; c < 10; c++)
                venue.click();

            rValue = venue.getValue();

            for (int c = 1; c < 5; c++)
            venue.unclick();

            rValue = venue.getValue();
            System.out.println("Expected: 5");
            System.out.println("Actual: " + rValue);

            venue.reset();
            rValue = 0;

            for (int c = 1; c < 3; c++)
            venue.click();

            rValue = venue.getValue();

            for (int c = 1; c < 4; c++)
            venue.unclick();

            rValue = venue.getValue();
            System.out.println("Expected: -1");
            System.out.println("Actual: " + rValue);

        }

        }

