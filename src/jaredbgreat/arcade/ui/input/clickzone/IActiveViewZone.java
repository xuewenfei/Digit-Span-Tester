// Copyright (c) Jared Blackburn 2017
// It is licensed under the creative commons 4.0 attribution license:
// https://creativecommons.org/licenses/by/4.0/legalcode 
package jaredbgreat.arcade.ui.input.clickzone;

import java.awt.event.MouseEvent;

/**
 *
 * @author jared
 */
public interface IActiveViewZone extends IViewZone {
    public void activate(MouseEvent e);
}