/*******************************************************************************
 * Copyright 2006-2016 TyTech B.V., Saturnusstraat 60, 2516 AH, The Hague, The Netherlands All rights reserved. This software is proprietary
 * information of TyTech B.V..
 ******************************************************************************/
package nl.tytech.data.editor.item;

import java.util.ArrayList;
import java.util.List;
import nl.tytech.core.event.Event.EventTypeEnum;
import nl.tytech.data.core.item.Word;

/**
 * @author Maxim Knepfle
 */
public class DefaultWord extends Word<DefaultWord.DefaultTerms> {

    public enum DefaultTerms implements EventTypeEnum {

        PERSONALINDICATOR_PIPE_NETWORK_POLLUTION_DESCRIPTION, PERSONALINDICATOR_PIPE_NETWORK_POLLUTION_NAME, PERSONALINDICATOR_PIPE_NETWORK_POLLUTION_SHORTNAME, PERSONALINDICATOR_PIPE_NETWORK_POLLUTION_IMAGENAME,

        PERSONALINDICATOR_PIPE_NETWORK_FINANCE_DESCRIPTION, PERSONALINDICATOR_PIPE_NETWORK_FINANCE_NAME, PERSONALINDICATOR_PIPE_NETWORK_FINANCE_SHORTNAME, PERSONALINDICATOR_PIPE_NETWORK_FINANCE_IMAGENAME,

        GLOBALINDICATOR_LIVABILITY_FILENAME, GLOBALINDICATOR_WATER_STORAGE_FILENAME, GLOBALINDICATOR_GREEN_FILENAME, GLOBALINDICATOR_HEAT_FILENAME, GLOBALINDICATOR_PARKING_FILENAME,

        GLOBALINDICATOR_TRAFFIC_NO2_FILENAME, GLOBALINDICATOR_TRAFFIC_NO2_DESCRIPTION, GLOBALINDICATOR_TRAFFIC_NO2_SHORTNAME, GLOBALINDICATOR_TRAFFIC_NO2_IMAGENAME, GLOBALINDICATOR_TRAFFIC_NO2_NAME,

        GLOBALINDICATOR_TRAFFIC_NOISE_FILENAME, GLOBALINDICATOR_TRAFFIC_NOISE_DESCRIPTION, GLOBALINDICATOR_TRAFFIC_NOISE_SHORTNAME, GLOBALINDICATOR_TRAFFIC_NOISE_IMAGENAME, GLOBALINDICATOR_TRAFFIC_NOISE_NAME,

        GLOBALINDICATOR_GREEN_DESCRIPTION, GLOBALINDICATOR_GREEN_NAME, GLOBALINDICATOR_GREEN_SHORTNAME, GLOBALINDICATOR_GREEN_IMAGENAME,

        GLOBALINDICATOR_WATER_STORAGE_DESCRIPTION, GLOBALINDICATOR_WATER_STORAGE_NAME, GLOBALINDICATOR_WATER_STORAGE_SHORTNAME, GLOBALINDICATOR_WATER_STORAGE_IMAGENAME,

        GLOBALINDICATOR_DEPRECATED_SHORTNAME, GLOBALINDICATOR_DEPRECATED_NAME, GLOBALINDICATOR_DEPRECATED_DESCRIPTION, GLOBALINDICATOR_DEPRECATED_IMAGENAME,

        GLOBALINDICATOR_PARKING_DESCRIPTION, GLOBALINDICATOR_PARKING_NAME, GLOBALINDICATOR_PARKING_SHORTNAME, GLOBALINDICATOR_PARKING_IMAGENAME,

        GLOBALINDICATOR_HEAT_DESCRIPTION, GLOBALINDICATOR_HEAT_NAME, GLOBALINDICATOR_HEAT_SHORTNAME, GLOBALINDICATOR_HEAT_IMAGENAME,

        GLOBALINDICATOR_LIVABILITY_DESCRIPTION, GLOBALINDICATOR_LIVABILITY_NAME, GLOBALINDICATOR_LIVABILITY_SHORTNAME, GLOBALINDICATOR_LIVABILITY_IMAGENAME,

        PERSONALINDICATOR_FINANCE_DESCRIPTION, PERSONALINDICATOR_FINANCE_NAME, PERSONALINDICATOR_FINANCE_SHORTNAME, PERSONALINDICATOR_FINANCE_IMAGENAME,

        PERSONALINDICATOR_HOUSING_DESCRIPTION, PERSONALINDICATOR_HOUSING_NAME, PERSONALINDICATOR_HOUSING_SHORTNAME, PERSONALINDICATOR_HOUSING_IMAGENAME,

        PERSONALINDICATOR_PIPE_NETWORK_CONNECTED_DESCRIPTION, PERSONALINDICATOR_PIPE_NETWORK_CONNECTED_NAME, PERSONALINDICATOR_PIPE_NETWORK_CONNECTED_SHORTNAME, PERSONALINDICATOR_PIPE_NETWORK_CONNECTED_IMAGENAME,

        PERSONALINDICATOR_PRODUCED_PRODUCTS_DESCRIPTION, PERSONALINDICATOR_PRODUCED_PRODUCTS_NAME, PERSONALINDICATOR_PRODUCED_PRODUCTS_SHORTNAME, PERSONALINDICATOR_PRODUCED_PRODUCTS_IMAGENAME,

        CUSTOMINDICATOR_QUALITATIVE_DESCRIPTION, CUSTOMINDICATOR_QUALITATIVE_NAME, CUSTOMINDICATOR_QUALITATIVE_SHORTNAME, CUSTOMINDICATOR_QUALITATIVE_CUSTOMUNITDIMENSION, CUSTOMINDICATOR_QUALITATIVE_IMAGENAME,

        APIINDICATOR_API_POST_DESCRIPTION, APIINDICATOR_API_POST_NAME, APIINDICATOR_API_POST_REMOTEADDRESS, APIINDICATOR_API_POST_SHORTNAME, APIINDICATOR_API_POST_IMAGENAME,

        EXCELINDICATOR_EXCEL_FILENAME, EXCELINDICATOR_EXCEL_DESCRIPTION, EXCELINDICATOR_EXCEL_SHORTNAME, EXCELINDICATOR_EXCEL_NAME, EXCELINDICATOR_EXCEL_IMAGENAME,

        HEATEXCELINDICATOR_HEAT_EXCEL_FILENAME, HEATEXCELINDICATOR_HEAT_EXCEL_DESCRIPTION, HEATEXCELINDICATOR_HEAT_EXCEL_SHORTNAME, HEATEXCELINDICATOR_HEAT_EXCEL_NAME, HEATEXCELINDICATOR_HEAT_EXCEL_IMAGENAME,

        /**
         * Stakeholders
         */
        STAKEHOLDER_CIVILIAN_ASSIGNMENT, STAKEHOLDER_CIVILIAN_PORTRAIT, STAKEHOLDER_CIVILIAN_DESCRIPTION, STAKEHOLDER_CIVILIAN_NAME, STAKEHOLDER_CIVILIAN_SHORTNAME,

        STAKEHOLDER_COMPANY_ASSIGNMENT, STAKEHOLDER_COMPANY_PORTRAIT, STAKEHOLDER_COMPANY_DESCRIPTION, STAKEHOLDER_COMPANY_NAME, STAKEHOLDER_COMPANY_SHORTNAME,

        STAKEHOLDER_EXPERT_ASSIGNMENT, STAKEHOLDER_EXPERT_PORTRAIT, STAKEHOLDER_EXPERT_DESCRIPTION, STAKEHOLDER_EXPERT_NAME, STAKEHOLDER_EXPERT_SHORTNAME,

        STAKEHOLDER_FARMER_ASSIGNMENT, STAKEHOLDER_FARMER_PORTRAIT, STAKEHOLDER_FARMER_DESCRIPTION, STAKEHOLDER_FARMER_NAME, STAKEHOLDER_FARMER_SHORTNAME,

        STAKEHOLDER_HEALTHCARE_ASSIGNMENT, STAKEHOLDER_HEALTHCARE_PORTRAIT, STAKEHOLDER_HEALTHCARE_DESCRIPTION, STAKEHOLDER_HEALTHCARE_NAME, STAKEHOLDER_HEALTHCARE_SHORTNAME,

        STAKEHOLDER_HOUSING_CORPORATION_ASSIGNMENT, STAKEHOLDER_HOUSING_CORPORATION_PORTRAIT, STAKEHOLDER_HOUSING_CORPORATION_DESCRIPTION, STAKEHOLDER_HOUSING_CORPORATION_NAME, STAKEHOLDER_HOUSING_CORPORATION_SHORTNAME,

        STAKEHOLDER_MUNICIPALITY_ASSIGNMENT, STAKEHOLDER_MUNICIPALITY_PORTRAIT, STAKEHOLDER_MUNICIPALITY_DESCRIPTION, STAKEHOLDER_MUNICIPALITY_NAME, STAKEHOLDER_MUNICIPALITY_SHORTNAME,

        STAKEHOLDER_MEDIA_ASSIGNMENT, STAKEHOLDER_MEDIA_PORTRAIT, STAKEHOLDER_MEDIA_DESCRIPTION, STAKEHOLDER_MEDIA_NAME, STAKEHOLDER_MEDIA_SHORTNAME,

        STAKEHOLDER_PROJECT_DEVELOPER_ASSIGNMENT, STAKEHOLDER_PROJECT_DEVELOPER_PORTRAIT, STAKEHOLDER_PROJECT_DEVELOPER_DESCRIPTION, STAKEHOLDER_PROJECT_DEVELOPER_NAME, STAKEHOLDER_PROJECT_DEVELOPER_SHORTNAME,

        STAKEHOLDER_WATER_BOARD_ASSIGNMENT, STAKEHOLDER_WATER_BOARD_PORTRAIT, STAKEHOLDER_WATER_BOARD_DESCRIPTION, STAKEHOLDER_WATER_BOARD_NAME, STAKEHOLDER_WATER_BOARD_SHORTNAME,

        STAKEHOLDER_OTHER_AUTHORITY_ASSIGNMENT, STAKEHOLDER_OTHER_AUTHORITY_PORTRAIT, STAKEHOLDER_OTHER_AUTHORITY_DESCRIPTION, STAKEHOLDER_OTHER_AUTHORITY_NAME, STAKEHOLDER_OTHER_AUTHORITY_SHORTNAME,

        STAKEHOLDER_OTHER_ASSIGNMENT, STAKEHOLDER_OTHER_PORTRAIT, STAKEHOLDER_OTHER_DESCRIPTION, STAKEHOLDER_OTHER_NAME, STAKEHOLDER_OTHER_SHORTNAME,

        STAKEHOLDER_EDUCATION_ASSIGNMENT, STAKEHOLDER_EDUCATION_PORTRAIT, STAKEHOLDER_EDUCATION_DESCRIPTION, STAKEHOLDER_EDUCATION_NAME, STAKEHOLDER_EDUCATION_SHORTNAME,

        STAKEHOLDER_UTILITY_CORPORATION_ASSIGNMENT, STAKEHOLDER_UTILITY_CORPORATION_PORTRAIT, STAKEHOLDER_UTILITY_CORPORATION_DESCRIPTION, STAKEHOLDER_UTILITY_CORPORATION_NAME, STAKEHOLDER_UTILITY_CORPORATION_SHORTNAME,

        /**
         * Overlays
         */

        OVERLAY_WATER_STRESS_ICONFILENAME, OVERLAY_WATER_STRESS_NAME,

        OVERLAY_FLOODING_AREA_ICONFILENAME, OVERLAY_FLOODING_AREA_NAME,

        AREAOVERLAY_AREAS_ICONFILENAME, AREAOVERLAY_AREAS_NAME,

        OVERLAY_OWNERSHIP_ICONFILENAME, OVERLAY_OWNERSHIP_NAME,

        OVERLAY_UNDERGROUND_ICONFILENAME, OVERLAY_UNDERGROUND_NAME,

        OVERLAY_TRAFFIC_FLOW_ICONFILENAME, OVERLAY_TRAFFIC_FLOW_NAME,

        OVERLAY_ZONING_ICONFILENAME, OVERLAY_ZONING_NAME,

        GRIDOVERLAY_DISTANCE_ZONE_ICONFILENAME, GRIDOVERLAY_DISTANCE_ZONE_NAME,

        GRIDOVERLAY_DISTANCE_SIGHT_ICONFILENAME, GRIDOVERLAY_DISTANCE_SIGHT_NAME,

        SUBSIDENCEOVERLAY_SUBSIDENCE_ICONFILENAME, SUBSIDENCEOVERLAY_SUBSIDENCE_NAME,

        SUBSIDENCEOVERLAY_SUBSIDENCE_WATERLEVELKEY, SUBSIDENCEOVERLAY_SUBSIDENCE_CLAYTHICKNESSKEY, SUBSIDENCEOVERLAY_SUBSIDENCE_SUBSIDENCEKEY,

        GROUNDWATEROVERLAY_GROUND_WATER_HI_WATERLEVELKEY, GROUNDWATEROVERLAY_GROUND_WATER_HI_ICONFILENAME, GROUNDWATEROVERLAY_GROUND_WATER_HI_NAME,

        GROUNDWATEROVERLAY_GROUND_WATER_LOW_WATERLEVELKEY, GROUNDWATEROVERLAY_GROUND_WATER_LOW_ICONFILENAME, GROUNDWATEROVERLAY_GROUND_WATER_LOW_NAME,

        GROUNDWATEROVERLAY_GROUND_WATER_HI_GROUNDWATERLEVELKEY, GROUNDWATEROVERLAY_GROUND_WATER_LOW_GROUNDWATERLEVELKEY, SUBSIDENCEOVERLAY_SUBSIDENCE_GROUNDWATERLEVELKEY,

        GROUNDWATEROVERLAY_GROUND_WATER_HI_WATERLEVELINCREASEKEY, GROUNDWATEROVERLAY_GROUND_WATER_LOW_WATERLEVELINCREASEKEY, SUBSIDENCEOVERLAY_SUBSIDENCE_WATERLEVELINCREASEKEY,

        GRIDOVERLAY_HEAT_ICONFILENAME, GRIDOVERLAY_HEAT_NAME,

        GRIDOVERLAY_TRAFFIC_NOISE_ICONFILENAME, GRIDOVERLAY_TRAFFIC_NOISE_NAME,

        NO2OVERLAY_TRAFFIC_NO2_ICONFILENAME, NO2OVERLAY_TRAFFIC_NO2_NAME,

        FUNCTIONSOVERLAY_FUNCTION_HIGHLIGHT_ICONFILENAME, FUNCTIONSOVERLAY_FUNCTION_HIGHLIGHT_NAME,

        OVERLAY_PIPE_NETWORK_FINANCIAL_ICONFILENAME, OVERLAY_PIPE_NETWORK_FINANCIAL_NAME,

        OVERLAY_PIPE_NETWORK_TECHNICAL_ICONFILENAME, OVERLAY_PIPE_NETWORK_TECHNICAL_NAME,

        GRIDOVERLAY_LIVABILITY_ICONFILENAME, GRIDOVERLAY_LIVABILITY_NAME,

        CUSTOMCOLOROVERLAY_CUSTOM_COLOR_AREAS_ICONFILENAME, CUSTOMCOLOROVERLAY_CUSTOM_COLOR_AREAS_NAME,

        OVERLAY_VACANCY_ICONFILENAME, OVERLAY_VACANCY_NAME,

        IMAGEOVERLAY_IMAGE_ICONFILENAME, IMAGEOVERLAY_IMAGE_NAME, IMAGEOVERLAY_IMAGE_IMAGENAME,

        PIPECLUSTEROVERLAY_PIPE_CLUSTERS_ICONFILENAME, PIPECLUSTEROVERLAY_PIPE_CLUSTERS_NAME,

        OVERLAY_ZIP_CODES_ICONFILENAME, OVERLAY_ZIP_CODES_NAME,

        /**
         * Other
         */

        ZONE_NORTH_EAST, ZONE_NORTH_WEST, ZONE_SOUTH_EAST, ZONE_SOUTH_WEST,

        ADDRESS_ZIP_CODE, ADDRESS_STREET_NAME;

        ;

        private static List<Class<?>> classes = new ArrayList<Class<?>>();
        static {
            classes.add(String.class);
        }

        @Override
        public boolean canBePredefined() {
            return false;
        }

        @Override
        public List<Class<?>> getClasses() {
            return classes;
        }

        @Override
        public Class<?> getResponseClass() {
            return null;
        }

        @Override
        public boolean isServerSide() {
            return false;
        }

    }

    private static final long serialVersionUID = 8819290445496645730L;

    @Override
    public DefaultTerms[] getEnumValues() {

        return DefaultTerms.values();
    }
}
