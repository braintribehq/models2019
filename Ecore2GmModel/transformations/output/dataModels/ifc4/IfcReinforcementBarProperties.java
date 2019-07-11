/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcReinforcementBarProperties of the Data Model iai.
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
{@link TotalCrossSectionArea}, 
{@link TotalCrossSectionAreaAsString}, 
{@link SteelGrade}, 
{@link BarSurface}, 
{@link EffectiveDepth}, 
{@link EffectiveDepthAsString}, 
{@link NominalBarDiameter}, 
{@link NominalBarDiameterAsString}, 
{@link BarCount}, 
{@link BarCountAsString}, 

* It provides of then following operations (getters and setters)
{@link getTotalCrossSectionArea},
{@link getTotalCrossSectionAreaAsString},
{@link getSteelGrade},
{@link getBarSurface},
{@link getEffectiveDepth},
{@link getEffectiveDepthAsString},
{@link getNominalBarDiameter},
{@link getNominalBarDiameterAsString},
{@link getBarCount},
{@link getBarCountAsString},
{@link setTotalCrossSectionArea},
{@link setTotalCrossSectionAreaAsString},
{@link setSteelGrade},
{@link setBarSurface},
{@link setEffectiveDepth},
{@link setEffectiveDepthAsString},
{@link setNominalBarDiameter},
{@link setNominalBarDiameterAsString},
{@link setBarCount},
{@link setBarCountAsString},
 */

@Description("")

public interface IfcReinforcementBarProperties extends GenericEntity, ifc4.IfcPreDefinedProperties {

	EntityType<IfcReinforcementBarProperties> T = EntityTypes.T(IfcReinforcementBarProperties.class);

	/* Constants for each property name. */
	java.lang.String TotalCrossSectionArea = "TotalCrossSectionArea";
	java.lang.String TotalCrossSectionAreaAsString = "TotalCrossSectionAreaAsString";
	java.lang.String SteelGrade = "SteelGrade";
	java.lang.String BarSurface = "BarSurface";
	java.lang.String EffectiveDepth = "EffectiveDepth";
	java.lang.String EffectiveDepthAsString = "EffectiveDepthAsString";
	java.lang.String NominalBarDiameter = "NominalBarDiameter";
	java.lang.String NominalBarDiameterAsString = "NominalBarDiameterAsString";
	java.lang.String BarCount = "BarCount";
	java.lang.String BarCountAsString = "BarCountAsString";

	@Description("")
	@Mandatory
	java.lang.Double getTotalCrossSectionArea();
	void setTotalCrossSectionArea(java.lang.Double TotalCrossSectionArea);
	@Description("")
	@Mandatory
	java.lang.String getTotalCrossSectionAreaAsString();
	void setTotalCrossSectionAreaAsString(java.lang.String TotalCrossSectionAreaAsString);
	@Description("")
	@Mandatory
	java.lang.String getSteelGrade();
	void setSteelGrade(java.lang.String SteelGrade);
	@Description("")
	@Mandatory
	ifc4.IfcReinforcingBarSurfaceEnum getBarSurface();
	void setBarSurface(ifc4.IfcReinforcingBarSurfaceEnum BarSurface);
	@Description("")
	@Mandatory
	java.lang.Double getEffectiveDepth();
	void setEffectiveDepth(java.lang.Double EffectiveDepth);
	@Description("")
	@Mandatory
	java.lang.String getEffectiveDepthAsString();
	void setEffectiveDepthAsString(java.lang.String EffectiveDepthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getNominalBarDiameter();
	void setNominalBarDiameter(java.lang.Double NominalBarDiameter);
	@Description("")
	@Mandatory
	java.lang.String getNominalBarDiameterAsString();
	void setNominalBarDiameterAsString(java.lang.String NominalBarDiameterAsString);
	@Description("")
	@Mandatory
	java.lang.Double getBarCount();
	void setBarCount(java.lang.Double BarCount);
	@Description("")
	@Mandatory
	java.lang.String getBarCountAsString();
	void setBarCountAsString(java.lang.String BarCountAsString);
}
