import React from 'react';
import cohorts from './cohorts';
import styles from './CohortDetails.module.css';

const CohortDetails = () => {
  return (
    <div className={styles.cohortsGrid}>
      {cohorts.map((cohort) => (
        <div key={cohort.cohortCode} className={styles.box}>
          <h3 style={{ color: cohort.currentStatus === 'Ongoing' ? 'green' : 'blue' }}>
            {cohort.technology}
          </h3>
          <dl className={styles.detailsList}>
            <dt>Course Code</dt>
            <dd>{cohort.cohortCode}</dd>
            
            <dt>Started On</dt>
            <dd>{cohort.startDate}</dd>
            
            <dt>Current Status</dt>
            <dd>{cohort.currentStatus}</dd>
            
            <dt>Coach</dt>
            <dd>{cohort.coach}</dd>
            
            <dt>Trainer</dt>
            <dd>{cohort.trainer}</dd>
          </dl>
        </div>
      ))}
    </div>
  );
};

export default CohortDetails;
