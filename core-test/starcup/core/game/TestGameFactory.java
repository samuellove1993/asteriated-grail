/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class TestGameFactory extends TestCase {

    @Test
    public void testGetInstall() {
        assertNotNull(GameFactory.getInstance());
        assertEquals(GameFactory.getInstance(), GameFactory.getInstance());
    }
}
