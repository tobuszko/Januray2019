package Enum;

public enum Formatter {
    CALM {
        @Override
        public String format(String message) {
            return "To jest Twoja wiadomość: " + message;
        }
    },
    NERVOUS{
        @Override
        public String format(String message) {
            return "Przestań zawracać mi glowę swoją wiadoamością: " + message;
        }
    };

    public abstract  String format (String message);

}
