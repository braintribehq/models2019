/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTextureCoordinateGenerator of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link Mode}, 
{@link Parameter}, 
{@link ParameterAsString}, 

* It provides of then following operations (getters and setters)
{@link getMode},
{@link getParameter},
{@link getParameterAsString},
{@link setMode},
{@link setParameter},
{@link setParameterAsString},
 */

@Description("")

public interface IfcTextureCoordinateGenerator extends GenericEntity, ifc4.IfcTextureCoordinate {

	EntityType<IfcTextureCoordinateGenerator> T = EntityTypes.T(IfcTextureCoordinateGenerator.class);

	/* Constants for each property name. */
	java.lang.String Mode = "Mode";
	java.lang.String Parameter = "Parameter";
	java.lang.String ParameterAsString = "ParameterAsString";

	@Description("")
	@Mandatory
	java.lang.String getMode();
	void setMode(java.lang.String Mode);
	@Description("")
	
	java.util.List<java.lang.Double> getParameter();
	void setParameter(java.util.List<java.lang.Double> Parameter);

	@Description("")
	
	java.util.List<java.lang.String> getParameterAsString();
	void setParameterAsString(java.util.List<java.lang.String> ParameterAsString);

}
