/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCartesianTransformationOperator2DnonUniform of the Data Model iai.
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
{@link Scale2}, 
{@link Scale2AsString}, 
{@link Scl2}, 
{@link Scl2AsString}, 

* It provides of then following operations (getters and setters)
{@link getScale2},
{@link getScale2AsString},
{@link getScl2},
{@link getScl2AsString},
{@link setScale2},
{@link setScale2AsString},
{@link setScl2},
{@link setScl2AsString},
 */

@Description("")

public interface IfcCartesianTransformationOperator2DnonUniform extends GenericEntity, ifc4.IfcCartesianTransformationOperator2D {

	EntityType<IfcCartesianTransformationOperator2DnonUniform> T = EntityTypes.T(IfcCartesianTransformationOperator2DnonUniform.class);

	/* Constants for each property name. */
	java.lang.String Scale2 = "Scale2";
	java.lang.String Scale2AsString = "Scale2AsString";
	java.lang.String Scl2 = "Scl2";
	java.lang.String Scl2AsString = "Scl2AsString";

	@Description("")
	@Mandatory
	java.lang.Double getScale2();
	void setScale2(java.lang.Double Scale2);
	@Description("")
	@Mandatory
	java.lang.String getScale2AsString();
	void setScale2AsString(java.lang.String Scale2AsString);
	@Description("")
	@Mandatory
	java.lang.Double getScl2();
	void setScl2(java.lang.Double Scl2);
	@Description("")
	@Mandatory
	java.lang.String getScl2AsString();
	void setScl2AsString(java.lang.String Scl2AsString);
}
