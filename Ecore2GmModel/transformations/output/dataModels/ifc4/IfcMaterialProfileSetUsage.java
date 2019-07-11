/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMaterialProfileSetUsage of the Data Model iai.
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
{@link ForProfileSet}, 
{@link CardinalPoint}, 
{@link ReferenceExtent}, 
{@link ReferenceExtentAsString}, 

* It provides of then following operations (getters and setters)
{@link getForProfileSet},
{@link getCardinalPoint},
{@link getReferenceExtent},
{@link getReferenceExtentAsString},
{@link setForProfileSet},
{@link setCardinalPoint},
{@link setReferenceExtent},
{@link setReferenceExtentAsString},
 */

@Description("")

public interface IfcMaterialProfileSetUsage extends GenericEntity, ifc4.IfcMaterialUsageDefinition {

	EntityType<IfcMaterialProfileSetUsage> T = EntityTypes.T(IfcMaterialProfileSetUsage.class);

	/* Constants for each property name. */
	java.lang.String ForProfileSet = "ForProfileSet";
	java.lang.String CardinalPoint = "CardinalPoint";
	java.lang.String ReferenceExtent = "ReferenceExtent";
	java.lang.String ReferenceExtentAsString = "ReferenceExtentAsString";

	@Description("")
	@Mandatory
	ifc4.IfcMaterialProfileSet getForProfileSet();
	void setForProfileSet(ifc4.IfcMaterialProfileSet ForProfileSet);
	@Description("")
	@Mandatory
	java.lang.Long getCardinalPoint();
	void setCardinalPoint(java.lang.Long CardinalPoint);
	@Description("")
	@Mandatory
	java.lang.Double getReferenceExtent();
	void setReferenceExtent(java.lang.Double ReferenceExtent);
	@Description("")
	@Mandatory
	java.lang.String getReferenceExtentAsString();
	void setReferenceExtentAsString(java.lang.String ReferenceExtentAsString);
}
