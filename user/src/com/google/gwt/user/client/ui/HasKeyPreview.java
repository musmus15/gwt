/*
 * Copyright 2006 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.user.client.ui;

/**
 * A class that implements this interface receives a preview of keyboard events
 * before they are passed to the focused widget.
 * 
 * @see com.google.gwt.event.dom.client.KeyCodeEvent
 * @deprecated This interface hasn't worked in at least two years. Oops.
 */
@Deprecated
public interface HasKeyPreview {

  /**
   * Called when a key-down event is received.
   * 
   * @param key the physical key that was depressed. Constants for this value
   *          are defined in this interface with the KEYCODE prefix.
   * @param modifiers the modifier keys pressed at when the event occurred. This
   *          value is a combination of the bits defined by
   *          {@link com.google.gwt.user.client.ui.KeyboardListener#MODIFIER_SHIFT},
   *          {@link com.google.gwt.user.client.ui.KeyboardListener#MODIFIER_CTRL},
   *          and
   *          {@link com.google.gwt.user.client.ui.KeyboardListener#MODIFIER_ALT}.
   */
  boolean onKeyDownPreview(char key, int modifiers);

  /**
   * Called when a key-press event is received.
   * 
   * @param key the Unicode character that was generated by the keyboard action.
   * @param modifiers the modifier keys pressed at when the event occurred. This
   *          value is a combination of the bits defined by
   *          {@link com.google.gwt.user.client.ui.KeyboardListener#MODIFIER_SHIFT},
   *          {@link com.google.gwt.user.client.ui.KeyboardListener#MODIFIER_CTRL},
   *          and
   *          {@link com.google.gwt.user.client.ui.KeyboardListener#MODIFIER_ALT}.
   */
  boolean onKeyPressPreview(char key, int modifiers);

  /**
   * Called when a key-up event is received.
   * 
   * @param key the physical key that was released. Constants for this value are
   *          defined in this interface with the KEYCODE prefix.
   * @param modifiers the modifier keys pressed at when the event occurred. This
   *          value is a combination of the bits defined by
   *          {@link com.google.gwt.user.client.ui.KeyboardListener#MODIFIER_SHIFT},
   *          {@link com.google.gwt.user.client.ui.KeyboardListener#MODIFIER_CTRL},
   *          and
   *          {@link com.google.gwt.user.client.ui.KeyboardListener#MODIFIER_ALT}.
   */
  boolean onKeyUpPreview(char key, int modifiers);
}
