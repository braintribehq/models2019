/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcProxy of the Data Model iai.
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
{@link ProxyType}, 
{@link Tag}, 

* It provides of then following operations (getters and setters)
{@link getProxyType},
{@link getTag},
{@link setProxyType},
{@link setTag},
 */

@Description("")

public interface IfcProxy extends GenericEntity, ifc4.IfcProduct {

	EntityType<IfcProxy> T = EntityTypes.T(IfcProxy.class);

	/* Constants for each property name. */
	java.lang.String ProxyType = "ProxyType";
	java.lang.String Tag = "Tag";

	@Description("")
	@Mandatory
	ifc4.IfcObjectTypeEnum getProxyType();
	void setProxyType(ifc4.IfcObjectTypeEnum ProxyType);
	@Description("")
	@Mandatory
	java.lang.String getTag();
	void setTag(java.lang.String Tag);
}
