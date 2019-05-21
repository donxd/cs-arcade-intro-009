String[] allLongestStrings(String[] inputArray) {
    String [] strings = new String [ inputArray.length ];
    int lengthPrevString = 0;
    int indexStrings = 0;
    
    for ( String element : inputArray ){
        
        if ( lengthPrevString < element.length() ){
            indexStrings = 0;
            lengthPrevString = element.length();
            strings = new String [ inputArray.length ];
        }
                
        if ( lengthPrevString == element.length() ){   
            strings[ indexStrings++ ] = element;
        }
    }

    return Arrays.copyOfRange( strings, 0, indexStrings );
}
