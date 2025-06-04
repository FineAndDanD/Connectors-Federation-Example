const express = require('express')
const app = express()
const port = 4014

app.get('/', (req, res) => {
  res.send("Hi mom");
})

app.get('/accounts', (req, res) => {

  console.log(req.params);
    res.send(JSON.stringify([
      {
          id: "1",
          name: "Steve Jobs",
          poolKeys: [
            "1"
          ],
          accountValue: "$502340",
          hasMutualFunds: true,
          isActive: false,
          accountBeneficiaries: [
            {
              mutualFunds: [
                {
                  name: "Rachel Test",
                  accountId: "9",
                  relationship: "Spouse"
                }
              ]
            }
          ]
      },
      {
          id: "2",
          name: "Doug Ford",
          poolKeys: [
            "1",
            "3"
          ],
          accountValue: "$1",
          hasMutualFunds: true,
          isActive: true,
          accountBeneficiaries: [
            {
              mutualFunds: [
                {
                  name: "Stacey Test",
                  accountId: "10",
                  relationship: "Spouse"
                }
              ]
            }
          ]
      },
      {
          id: "3",
          name: "Harry Potter",
          poolKeys: [
            "1",
            "2",
            "3"
          ],
          accountValue: "$999999999",
          hasMutualFunds: false,
          isActive: true,
          accountBeneficiaries: [
            {
              mutualFunds: [
                {
                  name: "Bob Test",
                  accountId: "11",
                  relationship: "Friend"
                }
              ]
            }
          ]
      }
  ]));
  })

app.get('/accounts/:accountId', (req, res) => {

  if (req.params.accountId === '1') {
    res.send({
          id: "1",
          name: "Steve Jobs",
          poolKeys: [
            "1"
          ],
          accountValue: "$502340",
          hasMutualFunds: true,
          isActive: false,
          accountBeneficiaries: [
            {
              mutualFunds: [
                {
                  name: "Rachel Test",
                  accountId: "9",
                  relationship: "Spouse"
                }
              ]
            }
          ]
      })
  } else {
    res.status(404).json({ error:  {
      message: 'Account not found'
    }})
  }
  
})

app.listen(port, () => {
  console.log(`Accounts API listening on port ${port}`)
})