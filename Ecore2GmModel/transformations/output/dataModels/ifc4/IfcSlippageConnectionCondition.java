/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSlippageConnectionCondition of the Data Model iai.
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
{@link SlippageX}, 
{@link SlippageXAsString}, 
{@link SlippageY}, 
{@link SlippageYAsString}, 
{@link SlippageZ}, 
{@link SlippageZAsString}, 

* It provides of then following operations (getters and setters)
{@link getSlippageX},
{@link getSlippageXAsString},
{@link getSlippageY},
{@link getSlippageYAsString},
{@link getSlippageZ},
{@link getSlippageZAsString},
{@link setSlippageX},
{@link setSlippageXAsString},
{@link setSlippageY},
{@link setSlippageYAsString},
{@link setSlippageZ},
{@link setSlippageZAsString},
 */

@Description("")

public interface IfcSlippageConnectionCondition extends GenericEntity, ifc4.IfcStructuralConnectionCondition {

	EntityType<IfcSlippageConnectionCondition> T = EntityTypes.T(IfcSlippageConnectionCondition.class);

	/* Constants for each property name. */
	java.lang.String SlippageX = "SlippageX";
	java.lang.String SlippageXAsString = "SlippageXAsString";
	java.lang.String SlippageY = "SlippageY";
	java.lang.String SlippageYAsString = "SlippageYAsString";
	java.lang.String SlippageZ = "SlippageZ";
	java.lang.String SlippageZAsString = "SlippageZAsString";

	@Description("")
	@Mandatory
	java.lang.Double getSlippageX();
	void setSlippageX(java.lang.Double SlippageX);
	@Description("")
	@Mandatory
	java.lang.String getSlippageXAsString();
	void setSlippageXAsString(java.lang.String SlippageXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getSlippageY();
	void setSlippageY(java.lang.Double SlippageY);
	@Description("")
	@Mandatory
	java.lang.String getSlippageYAsString();
	void setSlippageYAsString(java.lang.String SlippageYAsString);
	@Description("")
	@Mandatory
	java.lang.Double getSlippageZ();
	void setSlippageZ(java.lang.Double SlippageZ);
	@Description("")
	@Mandatory
	java.lang.String getSlippageZAsString();
	void setSlippageZAsString(java.lang.String SlippageZAsString);
}
