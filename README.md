# AdFox SDK Java
[![Build Status](https://travis-ci.org/kholodovitch/adfox_sdk_java.svg?branch=master)](https://travis-ci.org/kholodovitch/adfox_sdk_java)
[![Coverage Status](https://coveralls.io/repos/kholodovitch/adfox_sdk_java/badge.svg?branch=master&service=github)](https://coveralls.io/github/kholodovitch/adfox_sdk_java?branch=master)

Java implementation of client to AdFox API

## List of API methods

### account
  * add
    * superCampaign
    * campaign
    * advertiser
    * webmaster
    * assistant
    * website
    * zone
    * place
    * adNetworkWebsite
    * position
    * bannerType
    * banner
    * category
  * list
    * advertiser
    * webmaster
    * assistant
    * superCampaign
    * campaign
    * targetingProfile
    * bannerType
    * website
    * zone
    * place
    * adNetwork
    * adNetworkWebsitePlace
    * category
    * banner
    * bannerType
    * bannerPlacements
    * request
    * defaultBanner
    * tracingPoint
    * tracingPoint2
    * userCriterias
    * activeBanners
    * bannerPlaceReport
    * message 
  * delete
    * superCampaign
    * campaign
    * banner
    * place
    * zone
    * website
    * template
    * bannerType
    * tracingPoint
    * category
    * user
    * assistant
  * modify
    * category
  * report
    * report1
    * report2
    * report3
  * changePassword
    * currentPassword
    * newPassword
    * userID
    * roleFlag
  * auth
  * utility
    * geoTree

### superCampaign
  * modify
  * additionalUsers
    * addAdvertiser
    * deleteAdvertiser
    * addAssistant
    * deleteAssistant

### campaign
  * upload
    * URL
  * modify
  * list
    * banner
  * info
    * placement
    * placement2
    * banner
    * report1
    * report2
    * report3
    * targeting
  * placing
    * website
    * zone
    * place
    * adNetwork
    * adNetworkCategory
    * adNetworkWebsite
  * target
    * targetingTime
    * targetingFrequency
    * targetingBehavior
    * targetingGeo
    * targetingSearch
    * targetingUser
    * targetingKeywords
    * targetingSocdem
  * targetWebsite
    * targetingTime
    * targetingFrequency
    * targetingBehavior
    * targetingGeo
    * targetingSearch
    * targetingUser
    * targetingKeywords
  * targetZone
    * targetingTime
    * targetingFrequency
    * targetingBehavior
    * targetingGeo
    * targetingSearch
    * targetingUser
    * targetingKeywords
  * targetPlace
    * targetingTime
    * targetingFrequency
    * targetingBehavior
    * targetingGeo
    * targetingSearch
    * targetingUser
    * targetingKeywords
  * additionalUsers
    * addAdvertiser
    * deleteAdvertiser
    * addAssistant
    * deleteAssistant

### banner
  * modify
    * event
    * placement
  * info
    * report1
    * report2
    * report3
    * bannerFields
    * targeting
  * target
    * targetingTime
    * targetingFrequency
    * targetingBehavior
    * targetingGeo
    * targetingSearch
    * targetingKeywords
    * targetingUser

### website
  * modify

### adNetworkWebsite
  * modify
  * info
    * report1
    * report2
    * report3

### advertiser
  * availableReports

### webmaster
  * modify
  * info
    * balance

### assistant
  * modify

### zone
  * modify

### place
  * modify
  * updateDefaultBanner
  * info
    * report1
  * listActiveBanners

### position
  * modify

### bannerType
  * modify
  * list
    * template
  * updateDefaultBanner

### placement

### adNetwork
  * pricing
    * adNetwork
    * ... or empty
    * category
    * website

### code
  * info
    * place
    * campaignPlace
    * website
    * adNetworkWebsite

### tracingPoint
  * modify
  * getCode

### userCriteria
  * modify
  * addValue
  * modifyValue
  * removeValue
  * listValues
