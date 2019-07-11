/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcReinforcingBar of the Data Model iai.
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
{@link NominalDiameter}, 
{@link NominalDiameterAsString}, 
{@link CrossSectionArea}, 
{@link CrossSectionAreaAsString}, 
{@link BarLength}, 
{@link BarLengthAsString}, 
{@link PredefinedType}, 
{@link BarSurface}, 

* It provides of then following operations (getters and setters)
{@link getNominalDiameter},
{@link getNominalDiameterAsString},
{@link getCrossSectionArea},
{@link getCrossSectionAreaAsString},
{@link getBarLength},
{@link getBarLengthAsString},
{@link getPredefinedType},
{@link getBarSurface},
{@link setNominalDiameter},
{@link setNominalDiameterAsString},
{@link setCrossSectionArea},
{@link setCrossSectionAreaAsString},
{@link setBarLength},
{@link setBarLengthAsString},
{@link setPredefinedType},
{@link setBarSurface},
 */

@Description("")

public interface IfcReinforcingBar extends GenericEntity, ifc4.IfcReinforcingElement {

	EntityType<IfcReinforcingBar> T = EntityTypes.T(IfcReinforcingBar.class);

	/* Constants for each property name. */
	java.lang.String NominalDiameter = "NominalDiameter";
	java.lang.String NominalDiameterAsString = "NominalDiameterAsString";
	java.lang.String CrossSectionArea = "CrossSectionArea";
	java.lang.String CrossSectionAreaAsString = "CrossSectionAreaAsString";
	java.lang.String BarLength = "BarLength";
	java.lang.String BarLengthAsString = "BarLengthAsString";
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String BarSurface = "BarSurface";

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
	java.lang.Double getBarLength();
	void setBarLength(java.lang.Double BarLength);
	@Description("")
	@Mandatory
	java.lang.String getBarLengthAsString();
	void setBarLengthAsString(java.lang.String BarLengthAsString);
	@Description("")
	@Mandatory
	ifc4.IfcReinforcingBarTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcReinforcingBarTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	ifc4.IfcReinforcingBarSurfaceEnum getBarSurface();
	void setBarSurface(ifc4.IfcReinforcingBarSurfaceEnum BarSurface);
}
