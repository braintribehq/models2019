/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSectionReinforcementProperties of the Data Model iai.
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
{@link LongitudinalStartPosition}, 
{@link LongitudinalStartPositionAsString}, 
{@link LongitudinalEndPosition}, 
{@link LongitudinalEndPositionAsString}, 
{@link TransversePosition}, 
{@link TransversePositionAsString}, 
{@link ReinforcementRole}, 
{@link SectionDefinition}, 
{@link CrossSectionReinforcementDefinitions}, 

* It provides of then following operations (getters and setters)
{@link getLongitudinalStartPosition},
{@link getLongitudinalStartPositionAsString},
{@link getLongitudinalEndPosition},
{@link getLongitudinalEndPositionAsString},
{@link getTransversePosition},
{@link getTransversePositionAsString},
{@link getReinforcementRole},
{@link getSectionDefinition},
{@link getCrossSectionReinforcementDefinitions},
{@link setLongitudinalStartPosition},
{@link setLongitudinalStartPositionAsString},
{@link setLongitudinalEndPosition},
{@link setLongitudinalEndPositionAsString},
{@link setTransversePosition},
{@link setTransversePositionAsString},
{@link setReinforcementRole},
{@link setSectionDefinition},
{@link setCrossSectionReinforcementDefinitions},
 */

@Description("")

public interface IfcSectionReinforcementProperties extends GenericEntity, ifc4.IfcPreDefinedProperties {

	EntityType<IfcSectionReinforcementProperties> T = EntityTypes.T(IfcSectionReinforcementProperties.class);

	/* Constants for each property name. */
	java.lang.String LongitudinalStartPosition = "LongitudinalStartPosition";
	java.lang.String LongitudinalStartPositionAsString = "LongitudinalStartPositionAsString";
	java.lang.String LongitudinalEndPosition = "LongitudinalEndPosition";
	java.lang.String LongitudinalEndPositionAsString = "LongitudinalEndPositionAsString";
	java.lang.String TransversePosition = "TransversePosition";
	java.lang.String TransversePositionAsString = "TransversePositionAsString";
	java.lang.String ReinforcementRole = "ReinforcementRole";
	java.lang.String SectionDefinition = "SectionDefinition";
	java.lang.String CrossSectionReinforcementDefinitions = "CrossSectionReinforcementDefinitions";

	@Description("")
	@Mandatory
	java.lang.Double getLongitudinalStartPosition();
	void setLongitudinalStartPosition(java.lang.Double LongitudinalStartPosition);
	@Description("")
	@Mandatory
	java.lang.String getLongitudinalStartPositionAsString();
	void setLongitudinalStartPositionAsString(java.lang.String LongitudinalStartPositionAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLongitudinalEndPosition();
	void setLongitudinalEndPosition(java.lang.Double LongitudinalEndPosition);
	@Description("")
	@Mandatory
	java.lang.String getLongitudinalEndPositionAsString();
	void setLongitudinalEndPositionAsString(java.lang.String LongitudinalEndPositionAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTransversePosition();
	void setTransversePosition(java.lang.Double TransversePosition);
	@Description("")
	@Mandatory
	java.lang.String getTransversePositionAsString();
	void setTransversePositionAsString(java.lang.String TransversePositionAsString);
	@Description("")
	@Mandatory
	ifc4.IfcReinforcingBarRoleEnum getReinforcementRole();
	void setReinforcementRole(ifc4.IfcReinforcingBarRoleEnum ReinforcementRole);
	@Description("")
	@Mandatory
	ifc4.IfcSectionProperties getSectionDefinition();
	void setSectionDefinition(ifc4.IfcSectionProperties SectionDefinition);
	@Description("")
	
	java.util.List<ifc4.IfcReinforcementBarProperties> getCrossSectionReinforcementDefinitions();
	void setCrossSectionReinforcementDefinitions(java.util.List<ifc4.IfcReinforcementBarProperties> CrossSectionReinforcementDefinitions);

}
