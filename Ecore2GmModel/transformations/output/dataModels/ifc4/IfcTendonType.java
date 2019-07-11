/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTendonType of the Data Model iai.
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
{@link PredefinedType}, 
{@link NominalDiameter}, 
{@link NominalDiameterAsString}, 
{@link CrossSectionArea}, 
{@link CrossSectionAreaAsString}, 
{@link SheathDiameter}, 
{@link SheathDiameterAsString}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getNominalDiameter},
{@link getNominalDiameterAsString},
{@link getCrossSectionArea},
{@link getCrossSectionAreaAsString},
{@link getSheathDiameter},
{@link getSheathDiameterAsString},
{@link setPredefinedType},
{@link setNominalDiameter},
{@link setNominalDiameterAsString},
{@link setCrossSectionArea},
{@link setCrossSectionAreaAsString},
{@link setSheathDiameter},
{@link setSheathDiameterAsString},
 */

@Description("")

public interface IfcTendonType extends GenericEntity, ifc4.IfcReinforcingElementType {

	EntityType<IfcTendonType> T = EntityTypes.T(IfcTendonType.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String NominalDiameter = "NominalDiameter";
	java.lang.String NominalDiameterAsString = "NominalDiameterAsString";
	java.lang.String CrossSectionArea = "CrossSectionArea";
	java.lang.String CrossSectionAreaAsString = "CrossSectionAreaAsString";
	java.lang.String SheathDiameter = "SheathDiameter";
	java.lang.String SheathDiameterAsString = "SheathDiameterAsString";

	@Description("")
	@Mandatory
	ifc4.IfcTendonTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcTendonTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	java.lang.Double getNominalDiameter();
	void setNominalDiameter(java.lang.Double NominalDiameter);
	@Description("")
	@Mandatory
	java.lang.String getNominalDiameterAsString();
	void setNominalDiameterAsString(java.lang.String NominalDiameterAsString);
	@Description("")
	@Mandatory
	java.lang.Double getCrossSectionArea();
	void setCrossSectionArea(java.lang.Double CrossSectionArea);
	@Description("")
	@Mandatory
	java.lang.String getCrossSectionAreaAsString();
	void setCrossSectionAreaAsString(java.lang.String CrossSectionAreaAsString);
	@Description("")
	@Mandatory
	java.lang.Double getSheathDiameter();
	void setSheathDiameter(java.lang.Double SheathDiameter);
	@Description("")
	@Mandatory
	java.lang.String getSheathDiameterAsString();
	void setSheathDiameterAsString(java.lang.String SheathDiameterAsString);
}
