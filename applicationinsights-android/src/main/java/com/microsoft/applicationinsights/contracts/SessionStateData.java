/*
 * Generated from SessionStateData.bond (https://github.com/Microsoft/bond)
*/
package com.microsoft.applicationinsights.contracts;

import com.microsoft.applicationinsights.contracts.shared.ITelemetry;
import com.microsoft.applicationinsights.contracts.shared.JsonHelper;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

/**
 * Data contract class SessionStateData.
 */
public class SessionStateData extends Domain implements
    ITelemetry
{
    /**
     * Backing field for property Ver.
     */
    private int ver = 2;
    
    /**
     * Backing field for property State.
     */
    private int state = SessionState.Start;
    
    /**
     * Initializes a new instance of the SessionStateData class.
     */
    public SessionStateData()
    {
        this.InitializeFields();
    }
    
    /**
     * Envelope Name for this telemetry.
     */
    public String getEnvelopeName() {
        return "Microsoft.ApplicationInsights.SessionState";
    }
    
    /**
     * Base Type for this telemetry.
     */
    public String getBaseType() {
        return "Microsoft.ApplicationInsights.SessionStateData";
    }
    
    /**
     * Gets the Ver property.
     */
    public int getVer() {
        return this.ver;
    }
    
    /**
     * Sets the Ver property.
     */
    public void setVer(int value) {
        this.ver = value;
    }
    
    /**
     * Gets the State property.
     */
    public int getState() {
        return this.state;
    }
    
    /**
     * Sets the State property.
     */
    public void setState(int value) {
        this.state = value;
    }
    

    /**
    * Gets the Properties property.
    */
    public Map<String, String> getProperties() {
        //Do nothing - does not currently take properties
        return null;
    }

    /**
    * Sets the Properties property.
    */
    public void setProperties(Map<String, String> value) {
        //Do nothing - does not currently take properties
    }

    /**
     * Serializes the beginning of this object to the passed in writer.
     * @param writer The writer to serialize this object to.
     */
    protected String serializeContent(Writer writer) throws IOException
    {
        String prefix = super.serializeContent(writer);
        writer.write(prefix + "\"ver\":");
        writer.write(JsonHelper.convert(this.ver));
        prefix = ",";
        
        writer.write(prefix + "\"state\":");
        writer.write(JsonHelper.convert(this.state));
        prefix = ",";
        
        return prefix;
    }
    
    /**
     * Optionally initializes fields for the current context.
     */
    protected void InitializeFields() {
        // method stub to initialize fields for the current context
    }
}
