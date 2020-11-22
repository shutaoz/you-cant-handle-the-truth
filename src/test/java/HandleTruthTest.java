import org.junit.Assert;
import org.junit.Test;


public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        String msg = "son we live in a world that has walls and those walls have to be guarded by men with guns whos gonna do it you you lieutenant weinberg i have a greater responsibility than you can possibly fathom you weep for santiago and you curse the marines you have that luxury you have the luxury of not knowing what i know that santiagos death while tragic probably saved lives and my existence while grotesque and incomprehensible to you saves lives you dont want the truth because deep down in places you dont talk about at parties you want me on that wall you need me on that wall we use words like honor code loyalty we use these words as the backbone of a life spent defending something you use them as a punchline i have neither the time nor the inclination to explain myself to a man who rises and sleeps under the blanket of the very freedom that i provide and then questions the manner in which i provide it i would rather you just said thank you and went on your way otherwise i suggest you pick up a weapon and stand a post either way i dont give a damn what you think you are entitled to";
        //HandleTruth.wordCount(msg);

        //case 1 when the parameter is empty
        //when the parameter is null, wordCount should return null as well
        Assert.assertNull(HandleTruth.wordCount(null));


        //case 2 when the parameter is valid
        //wordCount should return the expected string
        String test2 = "a a a b b c";
        String expected2 = "3=[a]2=[b]1=[c]";
        Assert.assertEquals(expected2, HandleTruth.wordCount(test2));


        //case 3 when the parameter is valid but differ from the one used in case 2
        //wordCount should return the expected string
        String test3 = "a b c a b c a b c a a b d e";
        String expected3 = "5=[a]4=[b]3=[c]1=[d, e]";
        Assert.assertEquals(expected3, HandleTruth.wordCount(test3));

        //case 4 when the parameter is valid but differ from the one used in case 3
        //wordCount should return the expected string
        String test4 = "a b c d e f g c d d d";
        String expected4 = "4=[d]2=[c]1=[a, b, e, f, g]";
        Assert.assertEquals(expected4, HandleTruth.wordCount(test4));


        //case 5 when the parameter is valid but differ from the one used in case 4
        //word count should return the expected string
        String test5 = "abc abc bbb ccc";
        String expected5 = "2=[abc]1=[ccc, bbb]";
        Assert.assertEquals(expected5, HandleTruth.wordCount(test5));
    }
}