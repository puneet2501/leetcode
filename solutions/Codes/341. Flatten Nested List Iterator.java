public class NestedIterator implements Iterator<Integer> {

    Stack<Iterator<NestedInteger>> st = new Stack<>();

    Integer val = null;

    public NestedIterator(List<NestedInteger> nestedList) {
        st.push(nestedList.iterator());
    }

    @Override
    public Integer next() {
        return val;
    }

    @Override
    public boolean hasNext() {

        val = null;

        while( !st.isEmpty() && st.peek().hasNext() ){

            NestedInteger next = st.peek().next();

            if( next.isInteger() ){
                val = next.getInteger();
            }else{
                st.push(next.getList().iterator());
            }

            while( !st.isEmpty() && !st.peek().hasNext() ) st.pop();

            if( val != null ) break;
        }

        return !st.isEmpty() || val != null ;
    }
}