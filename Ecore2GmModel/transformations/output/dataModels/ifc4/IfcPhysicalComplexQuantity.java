/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPhysicalComplexQuantity of the Data Model iai.
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
{@link HasQuantities}, 
{@link Discrimination}, 
{@link Quality}, 
{@link Usage}, 

* It provides of then following operations (getters and setters)
{@link getHasQuantities},
{@link getDiscrimination},
{@link getQuality},
{@link getUsage},
{@link setHasQuantities},
{@link setDiscrimination},
{@link setQuality},
{@link setUsage},
 */

@Description("")

public interface IfcPhysicalComplexQuantity extends GenericEntity, ifc4.IfcPhysicalQuantity {

	EntityType<IfcPhysicalComplexQuantity> T = EntityTypes.T(IfcPhysicalComplexQuantity.class);

	/* Constants for each property name. */
	java.lang.String HasQuantities = "HasQuantities";
	java.lang.String Discrimination = "Discrimination";
	java.lang.String Quality = "Quality";
	java.lang.String Usage = "Usage";

	@Description("")
	
	java.util.List<ifc4.IfcPhysicalQuantity> getHasQuantities();
	void setHasQuantities(java.util.List<ifc4.IfcPhysicalQuantity> HasQuantities);

	@Description("")
	@Mandatory
	java.lang.String getDiscrimination();
	void setDiscrimination(java.lang.String Discrimination);
	@Description("")
	@Mandatory
	java.lang.String getQuality();
	void setQuality(java.lang.String Quality);
	@Description("")
	@Mandatory
	java.lang.String getUsage();
	void setUsage(java.lang.String Usage);
}
