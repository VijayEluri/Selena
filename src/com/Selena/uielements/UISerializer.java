/**
 * This is the deserializer for the UI elements
 *
 * @author Gergely Brautigam
 */
package com.Selena.uielements;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


/**
 * UI Serializer object.
 *
 * @author Brautigam Gergely
 *
 */
public class UISerializer
{

    /**
     * Deserializer for the xmlUI elements.
     *
     * @param xml The xml to deserialize
     * @throws UIXmlReadErrorException
     * @return An serialized UIElement instance
     */
    public UIElements deserialize(final String xml) throws
        UIXmlReadErrorException
    {
        Serializer serializer = new Persister();
        File source = new File(xml);
        UIElements uiElement = null;

        try
        {
            uiElement = serializer.read(UIElements.class, source);
        } catch (Exception e)
        {
            throw new UIXmlReadErrorException(e.getMessage());
        }

        return uiElement;
    }


}
