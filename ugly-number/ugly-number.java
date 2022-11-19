public boolean isUgly(int n) {
        if(n == 1){
            return true;
        }

        if(n <= 0){
            return false;
        }

        Set<Integer> set = new HashSet<>();
        set = findPrimeFactors(n);

        for(Integer primeFactor : set){
            if(primeFactor > 5){
                return false;
            }
        }

        return true;
    }

    public Set<Integer> findPrimeFactors(int n){
        Set<Integer> set = new HashSet<>();
        while(n % 2 == 0){
            set.add(2);
            n /= 2;
        }

        for(int i = 3; i <= Math.sqrt(n); i += 2){
            while(n % i == 0){
                set.add(i);
                n /= i;
            }
        }

        if(n > 1){
            set.add(n);
        }

        return set;
    }
