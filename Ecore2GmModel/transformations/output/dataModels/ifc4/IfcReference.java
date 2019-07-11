/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcReference of the Data Model iai.
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
{@link TypeIdentifier}, 
{@link AttributeIdentifier}, 
{@link InstanceName}, 
{@link ListPositions}, 
{@link InnerReference}, 

* It provides of then following operations (getters and setters)
{@link getTypeIdentifier},
{@link getAttributeIdentifier},
{@link getInstanceName},
{@link getListPositions},
{@link getInnerReference},
{@link setTypeIdentifier},
{@link setAttributeIdentifier},
{@link setInstanceName},
{@link setListPositions},
{@link setInnerReference},
 */

@Description("")

public interface IfcReference extends GenericEntity, ifc4.IfcAppliedValueSelect, ifc4.IfcMetricValueSelect {

	EntityType<IfcReference> T = EntityTypes.T(IfcReference.class);

	/* Constants for each property name. */
	java.lang.String TypeIdentifier = "TypeIdentifier";
	java.lang.String AttributeIdentifier = "AttributeIdentifier";
	java.lang.String InstanceName = "InstanceName";
	java.lang.String ListPositions = "ListPositions";
	java.lang.String InnerReference = "InnerReference";

	@Description("")
	@Mandatory
	java.lang.String getTypeIdentifier();
	void setTypeIdentifier(java.lang.String TypeIdentifier);
	@Description("")
	@Mandatory
	java.lang.String getAttributeIdentifier();
	void setAttributeIdentifier(java.lang.String AttributeIdentifier);
	@Description("")
	@Mandatory
	java.lang.String getInstanceName();
	void setInstanceName(java.lang.String InstanceName);
	@Description("")
	
	java.util.List<java.lang.Long> getListPositions();
	void setListPositions(java.util.List<java.lang.Long> ListPositions);

	@Description("")
	@Mandatory
	ifc4.IfcReference getInnerReference();
	void setInnerReference(ifc4.IfcReference InnerReference);
}
