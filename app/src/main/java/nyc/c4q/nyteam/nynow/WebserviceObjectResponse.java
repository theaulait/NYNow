package nyc.c4q.nyteam.nynow;

/**
 * Created by c4q-anthony-mcbride on 6/23/15.
 */
public abstract class WebserviceObjectResponse {
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_FAILURE = 1;

    public abstract void response(Object obj, int resultStatus);
}
