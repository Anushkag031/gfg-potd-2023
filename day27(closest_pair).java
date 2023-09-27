 ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = m - 1;

        int a = arr[i];
        int b = brr[j];

        int value = Integer.MAX_VALUE;

        while (i < arr.length && j >= 0)
        {
            int sum =arr[i]+brr[j];
            int diff = Math.abs(x - sum);
            if (value > diff)
            {
                value = diff;
                a = arr[i];
                b = brr[j];
            }

            if (sum < x)
            {
                i++;
            }
            else j--;
           
        }
        list.add(a);
        list.add(b);

        return list;
