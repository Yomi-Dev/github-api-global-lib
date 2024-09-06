def call(Map config = [:]) {
    def name = config.get('name', 'Guest')  // Default value 'Guest' if name is not provided
    def day = config.get('day', 'today')    // Default value 'today' if day is not provided

    echo "Hello, ${name}. Today is ${dayOfWeek}."
}
